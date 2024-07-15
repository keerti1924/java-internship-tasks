//Functions
let person={
    name:"Keerti",
    age:24,
    trade:"ADIT",
    city:"Bangalore",
    greet:function(){
        console.log("Hello, My name is "+this.name);
    }
}

// Call greet function
person.greet();