//tính điểm trung bình
{   var vatly;
    var hoahoc;
    var sinhhoc;
    vatly = prompt("Nhập điểm môn Vật lý");
    hoahoc = prompt("Nhập điểm môn Hóa Học");
    sinhhoc = prompt("Nhập điểm môn Sinh Học");
    var ly=parseInt(vatly);
    var hoa=parseInt(hoahoc);
    var sinh=parseInt(sinhhoc);
    var a =(ly + hoa + sinh)/3;
    var x =ly + hoa + sinh;
    document.write("Điểm trung bình= " + a+"<br>");
    document.write("Điểm tổng ba môn= " + x+"<br>");
}

//chuyển đổi nhiệt độ
{
    var C;
    C = prompt("Nhập vào C : ");
    var c=parseInt(C);
    var f = (9*c)/5 + 32;
    document.write("kết quả F= " + f+"<br>");
}
// diện tích hình tròn
{
    var pi;
    var r;
    r = prompt("Nhập vào Bán Kính :");
    var R = parseInt(r);
    pi = 3,14;
    var A = (pi * R * R);
    document.write("Kết quả Diện Tích Hình Tròn là = " + A + "<br>");
}
// chu vi hình tròn
{
    var pi;
    var r;
    r = prompt("Nhập vào Bán Kính :");
    var R = parseInt(r);
    pi = 3,14;
    var C = (pi * 2 * R);
    document.write("Kết quả Chu vi Hình Tròn là = " + C + "<br>");
}