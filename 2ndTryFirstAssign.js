//function countChrOccurence () 
//{
    let str = 'aaababbccccbc'
    let charMap = new Map();
    const count = 0;  
    let boolean;    
    for (const key of str) {
         charMap.set(key,count); 
         }  
         
         
    for (const key of str) { 
        let count = charMap.get(key);
        charMap.set(key, count + 1);  
        }
       
        
        for (const [key,value] of charMap) { 
            //console.log(key,value);  
            //console.log(value);
            if (value/(Math.round((value/2)))==2)
                boolean = true;
             else{
                boolean = false;
                break;
             }

            
        }


        


        if (boolean)
            console.log("Balanced string");
        else
            console.log("Imbalanced string");
  //  }


    //countChrOccurence();