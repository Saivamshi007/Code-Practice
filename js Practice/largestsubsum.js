sum=(arr,key)=>{
   var total=[];

    for(var i=0;i<arr.length-key+1;i++){
            var add=0;
        for(var j=0;j<key;j++){
            add=add+arr[i+j]
        }
        total.push(add)

    }

        console.log(total)

        

    }
