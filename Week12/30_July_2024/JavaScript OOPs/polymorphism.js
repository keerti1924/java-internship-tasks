
class Animal {
    makeSound() {
        console.log('This animal makes a sound');
    }
}

class Dog extends Animal {
    makeSound() {
        console.log('The dog barks');
    }
}

class Cat extends Animal {
    makeSound() {
        console.log('The cat meow');
    }
}

const myDog = new Dog();
const myCat = new Cat();
myDog.makeSound(); // The dog barks
myCat.makeSound(); // The cat meow




