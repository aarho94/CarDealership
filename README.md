# CarDealership

Phase One: Data Model
1. Create GitHub Repository: Create a new repository on GitHub for the project.
2. Clone Repository: Clone the repository to your local machine in the C:/pluralsight directory.
3. Define Data Model: Design the data model by creating the Vehicle and Dealership classes based on the provided UML diagram.
4. Vehicle Class: Implement the Vehicle class with attributes and constructors.
5. Dealership Class: Implement the Dealership class with attributes and constructors. Include methods for adding, removing, and retrieving vehicles.
6. Stubs for Dealership Methods: Implement stubs for search methods in the Dealership class, returning null for now.
7. Compile and Push: Compile the code, ensure there are no syntax errors, and push it to the GitHub repository.

Phase Two: Persistence Layer
1. Create Data File: Create a starter data file for the application.
2. Backup Data File: Make a backup of the data file for safety.
3. DealershipFileManager Class: Create the DealershipFileManager class responsible for reading and writing data files.
4. Implement getDealership(): Implement the getDealership() method to read the data file and populate the Dealership object.
5. Implement saveDealership(): Create the saveDealership() method to save the Dealership object back to the data file.
6. Compile and Push: Compile the code, ensure there are no syntax errors, and push it to the GitHub repository.
   
Phase Three: User Interface Layer
1. Create UserInterface Class: Develop the UserInterface class responsible for interacting with users.
2. Display Method: Implement the display() method to initialize the dealership and display the menu.
3. Process Methods: Implement process methods for each menu option to interact with the Dealership object.
4. Init Method: Create a private init() method to instantiate the Dealership object.
5. Display Vehicles Method: Implement a helper method to display lists of vehicles.
6. Compile and Push: Compile the code, ensure there are no syntax errors, and push it to the GitHub repository.
   
Phase Four: Program Main Method
1. Program Class: In the Program class, create the main() method.
2. Instantiate UserInterface: Instantiate the UserInterface class and call its display() method.
3. Compile and Push: Compile the code, ensure there are no syntax errors, and push it to the GitHub repository.
   
Phase Five: Functionality Implementation
1. Implement Search Methods: Start implementing functionality for searching vehicles by price, make/model, year range, color, mileage range, and type.
2. Implement Add/Remove Methods: Implement methods for adding and removing vehicles from the Dealership.
3. UserInterface Integration: Integrate add/remove functionality into the UserInterface and ensure it updates the data file.
4. Testing: Test all functionalities thoroughly to ensure they work as expected.
5. Finalize and Document: Finalize the application, document the code, and ensure it meets all requirements.
6. Compile and Push: Compile the final code, ensure there are no errors, and push it to the GitHub repository.


Home Screen:

<img width="351" alt="VehicleVault Home Screen" src="https://github.com/aarho94/CarDealership/assets/166449365/be588162-70c3-4206-83d1-f9533bf2da42">

Products Display Screen:

<img width="764" alt="VehicleVault Product Display" src="https://github.com/aarho94/CarDealership/assets/166449365/db8e245c-6ed9-4074-a44c-d7d1f013c7ea">

Exception Handling on Calculator Page:

<img width="458" alt="VehicleVault Exception Handling" src="https://github.com/aarho94/CarDealership/assets/166449365/590e4d67-d318-4795-94ed-0e29fc41800d">

One piece of code I was really happy to get working was my saveDealershipToFile method:

<img width="1011" alt="saveDealershipToFile Method" src="https://github.com/aarho94/CarDealership/assets/166449365/25303a26-601b-4de3-bc49-734c5fd8d7d7">

Specifically, I thought it was really cool to to be able to timestamp when changes were made using this line:

<img width="548" alt="Time Stamp file line" src="https://github.com/aarho94/CarDealership/assets/166449365/94e148b5-7756-4b24-b5e0-67942fdb074f">
