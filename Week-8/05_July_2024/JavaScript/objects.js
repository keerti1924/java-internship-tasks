let person = {
    firstName: "Keerti",
    lastName: "Vishwkarma",
    age: 24
  };
  console.log(person.firstName); 
  console.log(person["lastName"]);
  
  // Adding a property
  person.country = "India";
  console.log(person);
  
  // Removing a property
  delete person.age;
  console.log(person);
  