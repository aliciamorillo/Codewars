function padIt(str,n){
  var text = str;
  var num = 1;
  
  do{
    if (num % 2 === 0) {
      text = `${text}*`
    } else {
      text = `*${text}`
    }
    num++;
  } while (num<=n)
  
  return text;
}