const menu = {
    list() {
        return [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"地区分类","menuJump":"列表","tableName":"diqufenlei"}],"menu":"地区分类管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"地区美食","menuJump":"列表","tableName":"diqumeishi"}],"menu":"地区美食管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"美食文化","menuJump":"列表","tableName":"meishiwenhua"}],"menu":"美食文化管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"交流论坛","tableName":"forum"}],"menu":"交流论坛"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"网站资讯","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","查看评论"],"menu":"地区美食列表","menuJump":"列表","tableName":"diqumeishi"}],"menu":"地区美食模块"},{"child":[{"buttons":["查看","查看评论"],"menu":"美食文化列表","menuJump":"列表","tableName":"meishiwenhua"}],"menu":"美食文化模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看"],"menu":"地区美食","menuJump":"列表","tableName":"diqumeishi"}],"menu":"地区美食管理"},{"child":[{"buttons":["查看"],"menu":"美食文化","menuJump":"列表","tableName":"meishiwenhua"}],"menu":"美食文化管理"},{"child":[{"buttons":["查看"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"},{"child":[{"buttons":["查看"],"menu":"网站资讯","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","查看评论"],"menu":"地区美食列表","menuJump":"列表","tableName":"diqumeishi"}],"menu":"地区美食模块"},{"child":[{"buttons":["查看","查看评论"],"menu":"美食文化列表","menuJump":"列表","tableName":"meishiwenhua"}],"menu":"美食文化模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]
    }
}
export default menu;