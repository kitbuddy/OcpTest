(function palindrome() {

    value = 'racecar';

    if(reverseString(value) === value) {
        console.log(true);
    } else {
        console.log(false);
    }
}) ();

function reverseString(value) {
    reversedValue = ''

    for(let char of value) {
        reversedValue = char + reversedValue;
    }

    console.log(reversedValue)
    return reversedValue;
}