var projectName = "电子产品购物系统"

if(!window.menus){
    let menusJSON = localStorage.getItem("menus")
    if(!menusJSON){
        http.get("menu/list",{
            params:{
                page: 1,
                limit: 1,
                sort: 'id',
            }
        }).then(res=>{
            menusJSON = res.data.data.list[0].menujson
            localStorage.setItem("menus", res.data.data.list[0].menujson)
            window.menus = JSON.parse(menusJSON)
        })
    }else{
        window.menus = JSON.parse(menusJSON)
    }
}
var indexMenuList = [
    {
        name: '商品信息',
        icon: 'icon-common2',
        child:[
            {
                name:'商品信息',
                url:'client/page/shangpinxinxi/list.html'
            },

        ]
    },
]

function navigateTo(menuItem){
    let url = ''
    if (menuItem.tableName == 'center'){
        return
    }
    else if(menuItem.tableName=='examrecord'&&menuItem.menuJump=='22'){
        url = `${baseUrl}client/page/examfailrecord/list.html?centerType=1`
    }
    else if(menuItem.tableName=='exampaper'&&menuItem.menuJump=='12'){
        url =`${baseUrl}client/page/exampaper/list.html?centerType=1`
    }
    else if(menuItem.tableName=='forum'&&menuItem.menuJump=='14'){
        url = `${baseUrl}client/page/forum/list.html?centerType=1&&myType=1`
    }
    else if(["cart","address","orders"].includes(menuItem.tableName)){
        url = `${baseUrl}client/page/shop_${menuItem.tableName}/list.html?centerType=1`
    }
    else{
        switch (menuItem.menu){
            default:
                url = `${baseUrl}client/page/${menuItem.tableName}/list.html?centerType=1`
        }
    }
    location.href = url
}
