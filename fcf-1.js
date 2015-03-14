var hello = function(n) {
  console.log("hello, from a first class function");
};

var mult = function(a,b) {
  return a * b;
};

var times2 = function(b) {
  return mult(2, b);
};
setTimeout(hello, 3000);
