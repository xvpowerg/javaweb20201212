<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>
	console.log("Howard","18");
    let value = 10;
    let array = [5,"A","Java","Go!!"];
    console.log("value:",value);
    console.table(array);
//== 自動轉換類型的比較
//如果是數字比字串 會把字串轉成數字
//=== 不會自動轉換類型的比較
let v1 = 2;
let v2 = "2";
		if (v1 == v2){
		   //alert("v1 == v2");		
		   console.log("v1 == v2");
		}else{
		  // alert("v1 != v2");		
		  console.log("v1 != v2");
        }
let name = "Ken";
let age = 10;
let height = 18.56;
let str = "name:"+name+" age:\""+age+"\" height:"+height;
console.log(str)  
let str2 = `name:${name} age:${age} height:${height}`;      
console.log(str2) 
let func1 = function(var1){
        console.log(`var1 ${var1}`)
        return 10
}
console.log(func1('AA'))  
//Arrow function
let func2 = (var2)=>{
        console.log(`var2 ${var2}`);
}
func2(90)

let student = {
            name:"Ken",
            getName:function() {
                return this.name;
            }
         }
console.log(student.getName()) 

let obj2 = {
     id:"",
     setId(id){
            this.id = id;
     },
     getId(){
         return this.id
     }
};
obj2.setId(20);
console.log(obj2.getId());

var v1 = 20;
let v2 = 30;
</script>
</head>
<body>
<!--EL語法 依以下順序 取得Attribute的數值pageContext request session application -->
count:${count}
</body>
</html>