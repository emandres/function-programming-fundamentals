var recursion1 = require('./recursion-1.js');
var recursion3 = require('./recursion-3.js');

var example = process.argv[2];
var n = parseInt(process.argv[3]);

switch(example) {
  case "factorial":
    console.log(recursion1.factorial(n));
    break;
  case "count-up":
    console.log(recursion3.countUp(n));
    break;
}
