function twosDifference(input){
 input=input.sort((a,b)=>a-b)
  
 const newArray = [];
  
 for (let i=0;i<input.length;i++){
   for (let j=i+1;j<input.length;j++){
     if (Math.abs(input[i]-input[j])===2){newArray.push([input[i],input[j]]);break}
   }
 }
 return newArray;
}