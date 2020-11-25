//2부터 1000까지의 소수의 개수
//소수의 개수를 저장할 변수
var cnt = 0
//2부터 1000까지 
for(var i=2; i<=1000; i=i+1){
	//나누어 떨어지는지 확인할 변수
	var flag = true;
	//2부터 자신의 절반이 되는 숫자까지 
	for(var b=2; b<=parseInt(a/2); b=b+1){
		//나누어서 나누어 떨어지면 flag는 false
		if(i%b == 0){
			flag = false
			break
		}
	}
	//나누어 떨어진적이 없으면 
	if(flag == true){
		cnt = cnt + 1
	}
}
console.log("소수개수:" + cnt)

var fibo1 = function(n){
	if(n==1 || n==2){
		return 1
	}else{
		return fibo1(n-1)+fibo1(n-2)
	}
}

var fibo2 = function(n){
	var n1 = 1;
	var n2 = 1;
	var value;
	for(var i=3; i<=n; i=i+1){
		value = n1 + n2;
		n1 = n2;
		n2 = value;
	}
	return value;
}

