<template><!-- 자식 HTML 구현 부분 -->
  <div class="test">
    <h1>1. 이벤트 수식어 once</h1>
    <button v-on:click="x">x()</button>
    <!-- .once 수식어는 한 번만 이벤트가 발생 -->
    <button v-on:click.once="x">x()</button>

    <h1>2. preventDefault이벤트 수식어 .prevent</h1>
    <a href="htt://www.daum.net" v-on:click="y">다음1</a>
    <a href="htt://www.daum.net" v-on:click="y2">다음2</a>
    <!-- .prevent는 preventDefault()효과 -->
    <a href="htt://www.daum.net" v-on:click.prevent="y2">다음3_prevent</a>
  
    <h1>3. stop이벤트 수식어</h1>
    <div style="background-color:yellow" v-on:click ="aaa">
      aaa
      <!-- .stop stopPropagaion()효과 -->
      <div style="background-color:green" @click.stop ="bbb">
        bbb
      </div>
    </div>

    <h1>2. enter이벤트 수식어</h1>
    <input type="text" v-on:keyup="xyz"/>keyup<br>
    <!-- .enter 키브도ㅡ enter친 효과 -->
    <input type="text" v-on:keyup.enter="xyz"/>keyup.enter<br>

    <h1>5. ctrl</h1>
   <input type="text" v-on::keyup.ctrl.enter="xyz"/>ctrl.enter<br>
   <input type="text" v-on::keyup.ctrl.up="xyz"/>ctrl.up<br>

  </div>
</template>

<script>
export default {
  methods: {
    x: function() {
      console.log("x");
    },
    y: function() {
      console.log("y");
    },
    y2: function() {
      console.log("y2");
    },
    aaa: function() {
      console.log("aaa");
    },
    bbb: function() {
      console.log("bbb");
    },
    xyz: function() {
      console.log("xyz");
    },
  },

 
}
</script>

