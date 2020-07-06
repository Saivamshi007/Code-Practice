BinarySearch=(arr,val)=>{

    var left=0;
    var right=arr.length-1;
    let middle=Math.floor(left+right/2);


    while(arr[middle]!==val && left<=right){

         if(middle<val){
            left=middle+1;
        }else{
            right=middle-1;
        }

        middle=Math.floor(left+right/2);

        




    }

    return arr[middle]==val?middle:-1;

}