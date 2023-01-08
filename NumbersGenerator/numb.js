function numb(){
    let start = new Date();
    let count = 0;
    while(count<=100000){
        console.log(count);
        count++;
    } 
    let end = new Date();
    const time = (end.getTime()-start.getTime())/1000;
    console.log("Current time: ", time + " seconds.")
}

numb();