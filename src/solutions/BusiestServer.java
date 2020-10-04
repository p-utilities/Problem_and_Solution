package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>Problem :</b> You have k servers numbered from 0 to k-1 that are being
 * used to handle multiple requests simultaneously. Each server has infinite
 * computational capacity but cannot handle more than one request at a time. The
 * requests are assigned to servers according to a specific algorithm:
 * 
 * <p>
 * The ith (0-indexed) request arrives.
 * <p>
 * If all servers are busy, the request is dropped (not handled at all).
 * <p>
 * If the (i % k)th server is available, assign the request to that server.
 * <p>
 * Otherwise, assign the request to the next available server (wrapping around
 * the list of servers and starting from 0 if necessary). For example, if the
 * ith server is busy, try to assign the request to the (i+1)th server, then the
 * (i+2)th server, and so on.
 * <p>
 * You are given a strictly increasing array arrival of positive integers, where
 * arrival[i] represents the arrival time of the ith request, and another array
 * load, where load[i] represents the load of the ith request (the time it takes
 * to complete). Your goal is to find the busiest server(s). A server is
 * considered busiest if it handled the most number of requests successfully
 * among all the servers.
 * <p>
 * Return a list containing the IDs (0-indexed) of the busiest server(s). You
 * may return the IDs in any order.
 */

public class BusiestServer {
	List<Integer> servers;
	List<Integer> buisinestServers;
	private int totalMax;

	public List<Integer> busiestServers(int k, int[] arrival, int[] load) {
		totalMax = 0;
		servers = new ArrayList<Integer>();
		for (int i = 0; i < k; i++) {
			servers.add(0);
		}
		buisinestServers = new ArrayList<Integer>(servers);
		for (int i = 0; i < arrival.length; i++) {
			if (areAllBuisie())
				continue;

			int requestedServer = arrival[i] % k;
			if (servers.get(requestedServer) == 0) {
				servers.set(requestedServer, load[i]);
				buisinestServers.set(requestedServer, buisinestServers.get(requestedServer) + 1);
				checkTotalMax(buisinestServers.get(requestedServer));
			} else {
				requestedServer = i;
				if (requestedServer >= k)
					requestedServer = 0;
				for (int j = requestedServer; j < k; j++) {
					if (servers.get(j) == 0) {
						requestedServer = j;
						servers.set(j, load[i]);
						buisinestServers.set(requestedServer, buisinestServers.get(requestedServer) + 1);
						checkTotalMax(buisinestServers.get(requestedServer));
						break;
					}
					if (j >= k - 1)
						j = 0;
				}
			}

			int decrementTotal;
			if (i == 0)
				decrementTotal = 1;
			else {
				decrementTotal = arrival[i] - arrival[i - 1];
			}
			decrementLoads(decrementTotal);

		}

		return createResult();
	}

	private List<Integer> createResult() {
		var result = new ArrayList<Integer>();
		for (int i = 0; i < buisinestServers.size(); i++) {
			if (buisinestServers.get(i) == totalMax)
				result.add(i);
		}
		return result;
	}

	private void checkTotalMax(int currTotal) {
		if (totalMax < currTotal)
			totalMax = currTotal;
	}

	private void decrementLoads(int decrementTotal) {
		for (int i = 0; i < servers.size(); i++) {
			if (servers.get(i) > 0) {
				int decremantedValue = servers.get(i) - decrementTotal;
				if (decremantedValue <= 0) {
					decremantedValue = 0;
				}
				servers.set(i, decremantedValue);
			}
		}
	}

	private boolean areAllBuisie() {
		for (int server : servers) {
			if (server == 0)
				return false;
		}
		return true;
	}

//	public static void main(String[] args) {
//		BusiestServer system = new BusiestServer();
//		List<Integer> servers;
//		servers = system.busiestServers(3, new int[] { 1, 2, 3 }, new int[] { 10, 12, 11 });
//		for (int server : servers)
//			System.out.print(server);
//		System.out.println("    prvi");
//
//		servers = system.busiestServers(3, new int[] { 1, 2, 3, 4, 8, 9, 10 }, new int[] { 5, 2, 10, 3, 1, 2, 2 });
//		for (int server : servers)
//			System.out.print(server);
//		System.out.println("    drugi");
//
//		servers = system.busiestServers(3, new int[] { 1, 2, 3, 4, 5 }, new int[] { 5, 2, 3, 3, 3 });
//		for (int server : servers)
//			System.out.print(server);
//		System.out.println("    treci");
//
//		servers = system.busiestServers(3, new int[] { 1, 2, 3, 4 }, new int[] { 1, 2, 1, 2 });
//		for (int server : servers)
//			System.out.print(server);
//		System.out.println("   cetvrti");
//
//		servers = system.busiestServers(1, new int[] { 1 }, new int[] { 1 });
//		for (int server : servers)
//			System.out.print(server);
//		System.out.println("     peti");
//
//		servers = system.busiestServers(2, new int[] { 1, 2, 3 }, new int[] { 100000000, 1, 1000000 });
//		for (int server : servers)
//			System.out.print(server);
//		System.out.println("     peti");
//
//		servers = system.busiestServers(2, new int[] { 2, 3, 4, 8 }, new int[] { 3, 2, 4, 3 });
//		for (int server : servers)
//			System.out.print(server);
//		System.out.println("     peti");
//	}
}
