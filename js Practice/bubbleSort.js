bubbleSort=(arr)=>{

    let size=arr.length-1;

    for(let i=0;i<size;i++){
        for(let j=0;j<size-i;j++){

            if(arr[j]>arr[j+1]){
            var temp=arr[j]
            arr[j]=arr[j+1]
            arr[j+1]=temp
            }
        }
    }

    return arr;

}