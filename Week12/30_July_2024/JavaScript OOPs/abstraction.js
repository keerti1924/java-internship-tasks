// Define a Vehicle class
class Vehicle {
    constructor(make, model) {
        this.make = make;
        this.model = model;
    }

    // Abstract method to be implemented by subclasses
    start() {
        throw new Error('Method "start()" must be implemented.');
    }

    // Common method available to all subclasses
    getDetails() {
        return `This vehicle is a ${this.make} ${this.model}`;
    }
}

// Define a Car class that extends Vehicle
class Car extends Vehicle {
    constructor(make, model) {
        super(make, model);
    }

    // Implement the start method for Car
    start() {
        console.log(`Starting the car: ${this.make} ${this.model}`);
    }
}

// Define a Bike class that extends Vehicle
class Bike extends Vehicle {
    constructor(make, model) {
        super(make, model);
    }

    // Implement the start method for Bike
    start() {
        console.log(`Starting the bike: ${this.make} ${this.model}`);
    }
}

// Create instances of Car and Bike
const myCar = new Car('Toyota', 'Corolla');
const myBike = new Bike('Yamaha', 'MT-07');
const v = new Vehicle('Yamaha', 'MT-07');

// Use the methods
myCar.start(); // Output: Starting the car: Toyota Corolla
console.log(myCar.getDetails()); // Output: This vehicle is a Toyota Corolla

myBike.start(); // Output: Starting the bike: Yamaha MT-07
console.log(myBike.getDetails()); // Output: This vehicle is a Yamaha MT-07

v.start();
console.log(v.getDetails()); // throw error

