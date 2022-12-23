<h1 align = "center">Queueing Theory Project</h1>

**Sharing of resources and waiting in queues is a common phenomenon that occurs in every facet of our lives.<br>
The understanding and prediction of the stochastic behavior of these queues will provide a theoretical insight into the dynamics of these shared resources and how they can be designed to provide better utilization.<br>**

> **Queueing Theory** is the study of queues comes under a discipline of *Operations Research*, and is a primary methodological framework for evaluating resource performance besides simulation.

## Queueing System Components
- ### The Input Process:
  1. **The size of arriving population (infinite and finite).**
  2. **Arriving patterns:**
     * Customers may arrive at a queueing system either in some regular pattern **(Deterministic QS)** or in a totally random fashion **(Stochastic QS)**.
     * If customers arrive according to some random mode, then we need to fit a probability distribution to the arriving pattern in order to render the queueing analysis mathematically feasible.
     * The parameter that we commonly use to describe the arrival process is the *inter-arrival time* between two customers.
  3. **Behavior of arriving customers:**
     * **Blocking system:** If an arriving customer finds the system is full and leaves forever without entering the system.
     * **Store and Forward System:** For example, if calls are placed in queues, it is referred to as “lost-calls-delayed” discipline.
- ### The System Structure:
  1. **Physical number and layout of servers.**
  2. **The system capacity.**
- ### The Output Process:
  1. **Queueing discipline or serving discipline:** The way in which customers in the waiting queue are selected for service.
     * First-Come-First-Served (FCFS). 
     * Last-Come-First-Served (LCFS).
     * Priority.
     * Processor Sharing.
     * Random.
  2. **Service-time distribution:** Similar to arriving patterns.
## Kendall Notation
**David G. Kendall devised a shorthand notation to describe a queueing system containing a single waiting queue.**
<h3 align = "center">A / B / X / Y / Z</h3>

- **A:** Customer Arriving Pattern (*Inter-arrival-time* distribution).
- **B:** Service Pattern (*Service-time* distribution).
- **X:** Number of Parallel Servers.
- **Y:** *System Capacity*.
- **Z:** Queueing Discipline.
## Queueing Models
### Deterministic QS:
**In this model the arriving patterns and the service time distributions are constants.<br>
Any deterministic queue has the following parameters:**
- **Constant arrival rate (λ):** ( the constant time between successive arrivals in which the *inter-arrival time* = 1/λ ).
- **Constant rate of service (μ):** ( number of service completions per unit time when the server is busy; constant *service-time* = 1/μ ).
- **A single server:** ( i.e. one service channel ).
- **The system capacity (K – 1):** ( if a customer would increase the total number in the system to **K**, he will be refused to enter ).
- **FIFO (or FCFS) discipline.**

**So The queueing model is called _D / D / 1 / (K - 1) / FCFS_.**

**if λ > μ:**
- The number of customers in the system will continue to increase indefinitely (i.e. unstable system).
- The queueing system can be made stable by assuming that the **system capacity** is constant.
- When the number of customers in the system reaches the **system capacity**, recent arriving customers will not be allowed to enter and they will never return (balking).
- So the number of customers in the system will continue to increase until **ti** (where **ti** represents the time of occurrence of the first balk).

**Otherwise (λ ≤ μ):**
- Here, we have a very simple situation since there is never more than one customer in the system.
- It is only interesting to study this situation if we start the queueing process with initial customers **M** in the system.
- The transient characteristics of this process will be studied here until it reaches its steady state (at **ti**).
### Stochastic QS:
**Any stochastic queue has the following parameters:**
- **Arrival rate (λ).**
- **Service rate (μ).**
- **One server or more (_c_ servers).**
- **The system capacity:** ( infinite **(∞)** or finite **(K)** system capacity ).
- **FIFO discipline.**
## About This Project
### Overview:
**The modeling and analysis of waiting queues is the main implemented subject in this project.**
### Goals and Specifications:
**The following Models were implemented, _using Java, Java Swing GUI and JavaFX GUI_, in the project:**
- **_D / D / 1 / (K - 1)_: based on your inputs, the project can:**
  * Calculate **ti**.
  * Sketch **n(t)**: the number of customers in the system at time (t).
  * Sketch **Wq(n)**: the time that the n-th customer must wait in the queue to get service.
- **_M / M / 1_: based on your inputs, the project can calculate:**
  * **L**: Expected number of the customers in the system.
  * **Lq**: Expected number of the customers in the queue.
  * **W**: Expected waiting time in the system.
  * **Wq**: Expected waiting time in the queue.
  * **Pn**: The fraction of time when system at state n.
- **_M / M / 1 / K_: based on your inputs, the project can calculate:**
  * **L**.
  * **Lq**.
  * **W**.
  * **Wq**.
  * **Pn**.
- **_M / M / c_: based on your inputs, the project can calculate:**
  * **L**.
  * **Lq**.
  * **W**.
  * **Wq**.
  * **Ci**: Average number of idle servers.
  * **Pn**.
- **_M / M / c / K_: based on your inputs, the project can calculate:**
  * **L**.
  * **Lq**.
  * **W**.
  * **Wq**.
  * **Pn**.
### How it works?
**After downloading the project and running it, it would be very easy to understand and use it.**
### Screenshots:
<p align="center">
  <img src="https://user-images.githubusercontent.com/73803292/146626002-1af26044-2da7-450f-9ceb-5ce88abcf0c9.png" alt="Start Screen">
  <br><img src="https://user-images.githubusercontent.com/73803292/146626028-7ef39dc4-a709-40d4-b630-9ac6094c8501.png" alt="Deterministic Input Screen">
  <br><img src="https://user-images.githubusercontent.com/73803292/146626055-77858c53-d08e-4218-a6f6-aae128e40d3b.png" alt="Deterministic Output Screen (if λ > μ)">
  <br><img src="https://user-images.githubusercontent.com/73803292/146626094-aef1fe27-97a3-429c-b866-007fffdfd4b4.png" alt="Deterministic Output Screen (if λ ≤ μ)">
  <br><img src="https://user-images.githubusercontent.com/73803292/146626124-8a1f3b64-a368-4c8c-b1d7-fdc9c47f257f.png" alt="Stochastic Input Screen">
  <br><img src="https://user-images.githubusercontent.com/73803292/146626159-24523052-1725-432e-b5fb-a1a44e1e1d42.png" alt="M/M/c Input Screen">
  <br><img src="https://user-images.githubusercontent.com/73803292/146626170-0fda8cb0-7da6-490d-b3f0-69665a974796.png" alt="M/M/c Output Screen">
</p>
