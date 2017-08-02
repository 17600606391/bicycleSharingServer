var map = new AMap.Map('container', {
    resizeEnable: true,
    zoom: 20,
    center: [118.642371, 32.036997]
});
/*http://localhost:8080/api-bicycle-getX/1
http://localhost:8080/api-bicycle-getY/1*/
var greenBicycleCurrentX=[118.643371,118.642171,118.642171,118.642171,118.642271,118.642271,118.642371,118.642471,118.642471,118.642471,118.642471];
var greenBicycleCurrentY=[32.037997,32.037197,32.036897,32.036797,32.036797,32.036897,32.036897,32.036897,32.037097,32.038097,32.036097];
for (var i=0;i<greenBicycleCurrentX.length;i++){
    marker = new AMap.Marker({
        icon: "http://webapi.amap.com/theme/v1.3/markers/n/mark_b.png",
        position: [greenBicycleCurrentX[i],greenBicycleCurrentY[i]]
    });
    marker.setMap(map);
}
/*http://localhost:8080/api-bicycle-getX/-1
 http://localhost:8080/api-bicycle-getY/-1*/
var redBicycleCurrentX=[118.642371,118.642471,118.642571,118.642271,118.642171,118.642171];
var redBicycleCurrentY=[32.036997,32.036997,32.036997,32.036997,32.036997,32.037097];
for (var i=0;i<redBicycleCurrentX.length;i++){
    marker = new AMap.Marker({
        icon: "http://webapi.amap.com/theme/v1.3/markers/n/mark_r.png",
        position: [redBicycleCurrentX[i],redBicycleCurrentY[i]]
    });
    marker.setMap(map);
}
/*
marker = new AMap.Marker({
    icon: "http://webapi.amap.com/theme/v1.3/markers/n/mark_b.png",
    position: [118.6424, 32.037]
});
marker.setMap(map);
marker = new AMap.Marker({
    icon: "http://webapi.amap.com/theme/v1.3/markers/n/mark_r.png",
    position: [118.6424, 32.038]
});
marker.setMap(map);*/
