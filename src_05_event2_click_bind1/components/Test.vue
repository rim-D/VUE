<template><!-- 자식 HTML 구현 부분 -->
  <div class="test">

    <button @[aaa]="handleEvent">@[aaa]</button><br>
    <button v-on:[bbb]="handleEvent">@mouseover</button><br>
    <button @[ccc]="handleEvent">@[aaa]</button><br>
    <button v-on:[aaa]="handleEvent2" data-my="펭수"
    data-my2="{'name':'펭수','age':'10'}">click</button><br>
  </div>
</template>

<script>
export default {
  data() {
    return {
      aaa: 'click',//data속성을 이벤트이름으로 사용함
      bbb: 'mouseover',
      ccc: 'mouseleave'
    }
  },
  methods: {
    handleEvent: function(e){
      console.log("handleEvent@[aaa]", e);
    },
    handleEvent2: function(e){
      console.log(e, e.target.dataset.my);
      var x = JSON.parse(e.target.dataset.my2);
      console.log(x.name + "\t" + x.age);
    }
  }
}
</script>

<style scoped> /* 자식 CSS 구현 부분 */

</style>
