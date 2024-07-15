// Variables
let firstName = "Keerti";
let lastName = "Vishwkarma";
let age = 24;
const isEmployed = true;

// Data Types
let skills = ["JavaScript", "HTML", "CSS"];
let address = {
    street: "123 Main St",
    city: "Bangalore",
    state: "Karnataka"
};

// Operators and Expressions
let fullName = firstName + " " + lastName;
let isAdult = age >= 18;
let skillCount = skills.length;
let isWebDeveloper = isEmployed && (skills.includes("JavaScript") && skills.includes("HTML"));

// Output
console.log("Full Name:", fullName); 
console.log("Is Adult:", isAdult);
console.log("Number of Skills:", skillCount); 
console.log("Is Web Developer:", isWebDeveloper); 
console.log("Address:", address); 
