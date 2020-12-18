<template><!-- 자식 HTML 구현 부분 -->
  <div class="test">
    <h1>2. 기본이벤트  전파방지</h1>
    <div style="background-color:yellow" v-on:click ="aaa">
      aaa
      <div style="background-color:green" v-on:click ="bbb">
        bbb
      </div>
    </div>
  </div>
</template>

<script>
export default {
  methods: {
    aaa: function(){
      console.log("aaa");
      
    },
    bbb: function(e){
      console.log("bbb");
      e.stopPropagation();
    }
  }
 
}
</script>

