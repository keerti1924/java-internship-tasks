
class Person {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }

    greet() {
        console.log(`Hello, my name is ${this.name}`);
    }
}

const person1 = new Person('Keerti', 24);
person1.greet(); // Hello, my name is Keerti



