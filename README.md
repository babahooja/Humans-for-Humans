# Humans-for-Humans

***Product:*** A distributed computing based Volunteer Computing system to decrease genome analysis computations.

***Problem Statement:***
Genome sequencing is a computationally intensive and expensive technique of sequencing the genotype of a human.
A single sequence costs over 1000$ for sequencing and takes days for processing.
## Project Description:
### Law of Distributed Systems: The CAP Theorem
(_refer_: http://ksat.me/a-plain-english-introduction-to-cap-theorem/)  
It states that, when you are designing a distributed system you can get cannot achieve all three of Consistency, Availability and Partition tolerance. You can pick only two of:

1. **Consistency:** You customers, once they have updated information with you, will always get the most updated information when they call subsequently. No matter how quickly they call back
2. **Availability:** Remembrance Inc will always be available for calls until any one of you(you or your wife) report to work.
3. **Partition Tolerance:** Remembrance Inc will work even if there is a communication loss between you and your wife!

### Introduction to Distributed Computing

Networks as message flows  
  1.	Nodes interact via a network
    * Humans interact via spoken words
    *	Particles interact via fields
    * Computers (nodes) interact via IP, SCTP
	  * We model those interactions as discrete messages sent between nodes
  2. Messages take time to propagate
	  * This is the "slow" part of the distributed system
	  * We call this "latency"
  3. Messages can often be lost
    * This is another "unreliable" part of the distributed system
  4. Network is rarely homogenous
	  * Some links slower/smaller/more-likely-to-fail than others

### Use of a learning network to classify nodes as:
1. more likely to fail [0]
2. less likely to fail [1]

### Important Links for better understanding
WSG Process: https://www.cdc.gov/pulsenet/pathogens/wgs.html  
NASA's Home Initiative: https://en.wikipedia.org/wiki/SETI@home  
Indian based genome service: https://mapmygenome.in/  
Phred Quality Score: https://en.wikipedia.org/wiki/Phred_quality_score  
Distributed Systems Sources: https://github.com/theanalyst/awesome-distributed-systems
