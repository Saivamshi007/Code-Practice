same=(arr1,arr2)=>{
    if(arr1.length!==arr2.length){

        return false;
    }

    frequencycounter1={}
    frequencycounter2={}

    for(let val of arr1){
        frequencycounter1[val]=(frequencycounter1[val]||0)+1
    }

    for(let val of arr2){
        frequencycounter2[val]=(frequencycounter2[val]||0)+1
    }

    for(let key in frequencycounter1){
        if(!(key**2 in frequencycounter2)){

            return false;
        }
        if(frequencycounter2[key**2]!==frequencycounter1[key]){
                console.log(frequencycounter1);

            return false;
        }
    }

    console.log(frequencycounter2);
    return true;
}