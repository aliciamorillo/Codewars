function getSum( a,b ) {
  var max = Math.max(a, b),
      current = Math.min(a, b),
      sum = 0;
  
  while (current <= max) {
    sum += current++;
  }
  
  return a === b ? a : sum;
}