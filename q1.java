const arr = [1, 2, 3, 4, 5];

const reversedArray = arr.reduce((accumulator, currentValue) => {
  return [currentValue, ...accumulator];
}, []);

console.log(reversedArray);