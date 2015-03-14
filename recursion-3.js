exports.countUp = function countUp(n) {
  if (n > 1)
    return 1 + countUp(n - 1);
  else
    return 1;
};
