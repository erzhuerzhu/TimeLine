
8.  [Vue warn]: Do not use built-in or reserved HTML elements as component id: button 这个问题没解决掉，先不管了
7. 使用this.$router.push({path: '/'})可以实现<li><router-link to="/">Vue页面</router-link></li>一样的能力。
6. vue-router:核心是更新视图尾部重新请求页面：hash模式和history模式；
5. 箭头函数，es6之前，js中的函数有function关键字，params参数和被花括号包裹的函数提组成
4. 再设计css样式布局的时候，一定要先考虑好和统一好全局的样式设置，字体，padding，margin，全局颜色啥的，在不同的浏览器中的兼容性等等，用什么布局，怎么显示，给每一个元素套用div会不会影响加载的效率等等，还要学习新的，有创意的布局模式等等,可以先用原型设计工具来标记，也是方便后面的更改和校对，也可以先把名字给取好，模式不对就可以更改
3. css里image在div里各种图片的性质，图片真实大小像素和最终在浏览器里面显示的像素大小不一样，浏览器会由于一些配置而更改，这些东西就可以先不用管了，后面逐渐会了解的
2. vue把组件里面的template用render函数代替的，我们用render函数是更加易读易写，就是createElement，参考这篇文章https://juejin.im/post/5d15dc575188255d71255558
1. vue组件复用的思想，如何触发一个函数进而构成替换组件从而让组件消失