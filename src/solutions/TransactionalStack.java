package solutions;

/**
 * <b>Problem :</b> Write a class Solution that implements a stack data
 * structure. The data structure will hold positive integers within the range
 * [1...1000000000] and should implement the following stack operations:
 * <p>
 * - push(value): Pushes an element value to the stack. - top(): Returns the
 * topmost element(without removing it from the stack), or 0 if the stack is
 * empty. - pop(): Removes the topmost element from the stack, or does nothing
 * if the stack is empty.
 * <p>
 * In addition to the above operations, the stack should also support
 * transactions by implementing the following operations:
 * <p>
 * - begin(): Opens a new transaction block. Transaction blocks can be nested; a
 * begin() can be issued inside another existing block. Note that no transaction
 * is in progress before the first begin() call.
 * <p>
 * - rollback(): Undoes every stack operation issued in the current transaction
 * block, and closes the block. Returns true if successful, or false if no
 * transaction is in progress.
 * <p>
 * - commit(): commits every change in the stack. Returns true if commit is
 * successful or false if commit is not successful.
 * <p>
 * Stack is implemented using arrays only and it is
 * generic.
 *
 */
public class TransactionalStack<T> {
	private T[] stack;
	private int top = -1;
	private int size = 0;
	private Transaction currentTransaction;

	@SuppressWarnings("unchecked")
	public TransactionalStack() {
		stack = (T[]) new Object[16];
	}

	@SuppressWarnings("unchecked")
	public TransactionalStack(int initialSize) {
		stack = (T[]) new Object[initialSize];
	}

	public TransactionalStack(T[] startingStack) {
		stack = startingStack;
		top = startingStack.length - 1;
	}

	public void push(T element) {
		ensureCapacity();
		stack[++top] = element;
		size++;
	}

	/**
	 * @return null if there is no top!
	 */
	public T top() {
		if (top == -1)
			return null;
		return stack[top];
	}

	public T pop() {
		if (top != -1) {
			T element = stack[top];
			stack[top--] = null;
			size--;
			return element;
		}
		return null;
	}

	public int getSize() {
		return size;
	}

	@SuppressWarnings("unchecked")
	private void ensureCapacity() {
		if (top == stack.length - 1) {
			T[] helper = (T[]) new Object[stack.length * 2];
			for (int i = 0; i < stack.length - 1; i++)
				helper[i] = stack[i];
			stack = helper;
		}
	}

	public Transaction getTransaction() {
		return new Transaction();
	}

	public class Transaction {
		private Transaction previousTransaction;
		private T[] previousState;

		private Transaction() {
		}

		@SuppressWarnings("unchecked")
		public void begin() {
			previousState = (T[]) new Object[top + 1];
			for (int i = 0; i < previousState.length; i++)
				previousState[i] = stack[i];
			previousTransaction = currentTransaction;
			currentTransaction = this;
		}

		public boolean commit() {
			if (isCurrentTransaction()) {
				currentTransaction = previousTransaction;
				return true;
			}
			return false;
		}

		public boolean rollback() {
			if (isCurrentTransaction() && stack != null) {
				stack = previousState;
				currentTransaction = previousTransaction;
				top = stack.length - 1;
				size = top + 1;
				return true;
			}
			return false;
		}

		public boolean isCurrentTransaction() {
			if (currentTransaction == this)
				return true;
			return false;
		}

		public int numberOfPrevTrans() {
			if (previousTransaction != null) {
				return previousTransaction.numberOfPrevTrans() + 1;
			}
			return 0;
		}

	}
}
