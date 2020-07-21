unique=(arr)=>{

    frequency={}
    var count=0;

    for(var val of arr){
        frequency[val]=(frequency[val]||0)+1
    }

    for(var key in frequency){
        count++
    }


//    console.log(frequency.length)


    return Object.keys(frequency).length;

}