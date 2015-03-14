var f = (function() {
  var a = 3;
  var b = 7;

  return function(c) {
    return a * c + b;
  };
})();

var n = parseInt(process.argv[2]);
console.log("f(" + n + ") equals: " + f(n));
