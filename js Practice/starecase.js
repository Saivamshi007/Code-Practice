let staircase={
    onlyStair:function(n){
         let number_Of_ways=[];
     number_Of_ways[0]=1;
     number_Of_ways[1]=1;

     for(var i=2;i<n;i++){
         number_Of_ways[i]=number_Of_ways[i-1]+number_Of_ways[i-2];
     }

     console.log(number_Of_ways)

    },

    stairandSteps:function(n,steps){

        let number_Of_ways=[];
        number_Of_ways[0]=1;

        for(var i=1;i<n;i++){
            temp=0;
            for(var j of steps){
                if(i-j>=0){
                    temp+=number_Of_ways[i-j];
                }
                number_Of_ways[i]=temp;
            }

        }

       console.log(number_Of_ways)


    }
}

let obj=Object.create(staircase);


