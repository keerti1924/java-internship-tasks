// Inheritance example
class person {
    constructor(name) {
        this.name = name;
    }
    // method to return the string
    toString() {
        return (`Name of person: ${this.name}`);
    }
}
class student extends person {
    constructor(name, id) {
        // super keyword for callin g the above 
        // class constructor
        super(name);
        this.id = id;
    }
    getName() {
        return (`${super.toString()} and Student ID: ${this.id}`);
    }
}
let student1 = new student('Keerti', 22);
console.log(student1.getName());