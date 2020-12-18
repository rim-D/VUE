<template>
  <div>
      <ul v-for="(list, i) in todoList" v-bind:key="i">
        <li >
          {{ list }} <button v-on:click="del(i)">삭제</button>
        </li>
      </ul>
  </div>
</template>

<script>
import eventBus from './EventBus.vue';
export default {
data: function() {
    return {
      todoList: [],
    };
  },
  // eventBus.$on을 이용하여 처리할 이벤트 함수 등록
  created(){
      console.log("creat호출");
      eventBus.$on("start", this.add); // 이벤트 함수 등록
  },
  methods: {
      add: function(m){ //넘어노는 데이터를 매개변수로 받기
          this.todoList.push(m);
      },
      del: function(idx){
        this.todoList.splice(idx, 1);
      }
  }

}
</script>

<style>
ul, li {
  list-style: none;
  padding: 0;
  margin: 0;
}
li {
  padding: 10px;
}
</style>