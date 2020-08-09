# pricemodule
This price module is able to calculate the price of a cycle by passing the configurations.

-> A cycle can have the following different components:
	1. Frame
		i. material (String) - by which material cycle frame is designed
	
	2. Handle
		i. style (Boolean) - if this cycle handle has stylish handle or normal
		ii. discBrake (Boolean) - if this cycle handle contains disc brake or normal brake
		iii. bell (Boolean) - if this cycle handle contains bell or not

	3. Seating
		i. material (String) - by which material cycle seat is made

	4. Wheel
		i. rim (String) - by which material cycle wheel's rim is made
		ii. spokes (Boolean) - if this cycle has spokes or not
		iii. tube (Boolean) - if this cycle has tube in the tyre or not
		iv. tyre (String) - company name of the tyre used in this cycle

	5. Chain
		i. isGear (Boolean) - if this cycle has gear or not
		ii. gear (Integer) - if this has gear then what is number of gear present in it.

-> CalculatePrice.java contains the main method

-> JSON file has been used to read the inputs. Sample input are kept in the folder named "input". To read the JSON file json-simple-1.1.jar file is used.

-> For each component their instance is created and using getPrice() method their price is calculated based on the year passed. Finally total price of the cycle is calculated by adding all the price of each component.

-> ExecutorService is used to execute the thread where actual price calculation is done.

-> Enhancement - These configuration and pricing for each component can be made configurable and also can be able to changed them at startup and runtime.
