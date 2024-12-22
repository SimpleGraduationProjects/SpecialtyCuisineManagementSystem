const base = {
    get() {
        return {
            url : "http://localhost:8080/springbooti7ju1/",
            name: "springbooti7ju1",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbooti7ju1/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "特色美食网站"
        } 
    }
}
export default base
