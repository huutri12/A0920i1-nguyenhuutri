    const  nhapvao  = document.getElementById('nhapvao');
    const giatri1 = document.getElementById('a');
    const giatri2 = document.getElementById('b');
    const nhapbtn = document.getElementById("nhapnnn");
    const convert = document.getElementById('convert')
    nhapbtn.addEventListener("click",tiente)
    function tiente(){
        if(giatri1.value ==='VNĐ' && giatri2.value==='USD'){
            convert.innerHTML = nhapvao.value / 23000 + 'USD';
        }
        else if(giatri1 .value=== 'USD' && giatri2.value === 'VNĐ' ){
            convert.innerHTML = nhapvao .value* 23000 +'VNĐ';
        }
        else if(giatri1.value === 'VNĐ' &&  giatri2.value === 'VNĐ' ){
            convert.innerHTML ='Không Hợp Lệ'
        }
        else{
            convert.innerHTML ='Không Hợp Lệ'
        }
        console.log(giatri1 .value);
        console.log(giatri2 .value);
        console.log(typeof giatri1.value);
        console.log(typeof giatri2.value);
        console.log(giatri1.value ==='VNĐ');
        console.log(giatri2.value==='USD');
        console.log((giatri1.value =='VNĐ'&&giatri2.value=='USD'));
        console.log((giatri1.value =='USD'&&giatri2 .value== 'VNĐ'));
    }
