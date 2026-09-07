# Path Finding Algorithms

A Java implementation of **Dijkstra's algorithm** for finding the shortest path between points in a weighted graph — built independently, using AI as a learning tool to explain concepts (priority queues, graph relaxation) and review my code — all implementation decisions and code were written by me.

## What it does

Given a graph of nodes (points) connected by weighted edges (routes), this project calculates:
- The shortest total distance from a starting node to every other reachable node
- The actual sequence of nodes that make up that shortest route

For example, in a graph representing towns connected by roads of varying length, this finds not just "how far" but "which roads to take" for the cheapest route between any two towns.

## How it works

- **`Node`** — represents a single point in the graph.
- **`Edge`** — represents a weighted connection from one node to another.
- **`Graph`** — stores all nodes and their connections using an adjacency list (`Map<String, List<Edge>>`).
- **`NodeDistance`** — a small helper class implementing `Comparable`, used to order nodes in the priority queue by their current known distance.
- **`Dijkstra`** — the core algorithm. Uses a priority queue to always explore the closest unvisited node next, updating each node's shortest known distance as cheaper routes are discovered ("relaxing" edges). Also tracks each node's predecessor so the actual path (not just the distance) can be reconstructed afterward.


Currently working on A* now ive implamented Dijkstra
