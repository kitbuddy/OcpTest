let name1 = {
    firstName: 'ankit',
    lastName: 'jain',
    printFullName: function() {
        console.log(this.firstName + " " + this.lastName);
    }
}


printFullnameWithUpperCase = function() {
    console.log(this.firstName.toUpperCase() + " " + this.lastName.toUpperCase() )
}

printFullnameWithUpperCaseAndHometown = function(homeTown) {
    console.log(this.firstName.toUpperCase() 
                + " " 
                + this.lastName.toUpperCase() 
                + " from " + homeTown)
}

printFullnameWithUpperCaseAndHometownAndState = function(homeTown, state) {
    console.log(this.firstName.toUpperCase() 
                + " " 
                + this.lastName.toUpperCase() 
                + " from " + homeTown + ", " + state)
}

name1.printFullName();

printFullnameWithUpperCase.call(name1);

printFullnameWithUpperCaseAndHometown.call(name1, 'Gwalior')
// Using Call method
printFullnameWithUpperCaseAndHometownAndState.call(name1, 'gwalior', 'Mp');
// using Apply method
printFullnameWithUpperCaseAndHometownAndState.apply(name1, ['gwalior', 'MP']);


let name2 = {
    firstName: 'Seepika',
    lastName: 'Raj'
}

// function borrowing 
name1.printFullName.call(name2);
printFullnameWithUpperCase.call(name2);

printFullnameWithUpperCaseAndHometown.call(name2)
let PrintMyName = printFullnameWithUpperCaseAndHometownAndState.bind(name2, "mumbai", "maharastra" );


// diference between call and bind is Biind provides a method to be invoked later
PrintMyName();