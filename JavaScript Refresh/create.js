// using object literals syntax
const car = {"name": "Ford", "model": "Mustang", "year": 1964};
console.log(car.name);

// using new keyword
const person = new Object();
person.firstName = "Joey";
person.lastName = "Khalifa";
person.age = 25;
person.eyeColor = "brown";
console.log(person); 

// using constructor function 
function Car(name, model, year) {
    this.name = name;
    this.model = model;
    this.year = year;
}