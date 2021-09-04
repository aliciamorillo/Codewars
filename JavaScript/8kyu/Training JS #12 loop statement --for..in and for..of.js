function giveMeFive(obj){
  const result = [];
  
  for (const value in obj){
    if(value.length == 5){
      result.push(value);
    }
    
    if(obj[value].length == 5){
      result.push(obj[value]);
    }
    
  }
  
  return result;
}