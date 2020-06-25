anagram=(word1,word2)=>{

    let wordarray1=word1.split('');
    let wordarray2=word2.split('');

    let frequencycounyter1={}
    let frequencycounyter2={}

    if(wordarray1.length!=wordarray2.length){
        return false;
    }

    for(let val of wordarray1){
        frequencycounyter1[val]=(frequencycounyter1[val]||0)+1;
    }

    for(let val of wordarray2){
        frequencycounyter2[val]=(frequencycounyter2[val]||0)+1;
    }

    console.log(wordarray1)
    console.log(wordarray2)
    console.log(frequencycounyter1)
    console.log(frequencycounyter2)

    for(let key in frequencycounyter1){

                if(frequencycounyter1[key]!==frequencycounyter2[key]){
            return false;
        }
    }

    return true;

}