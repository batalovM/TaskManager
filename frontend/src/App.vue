// App.vue
<template>
  <div>
    <h1>Очередь на сдачу лабораторных</h1>
    <DisciplineList />
    <QueueList />
  </div>
</template>

<script>
import DisciplineList from './components/DisciplineList.vue';
import QueueList from './components/QueueList.vue';

export default {
  components: {
    DisciplineList,
    QueueList
  }
};
</script>

<style scoped>
h1 {
  text-align: center;
  margin-bottom: 20px;
}
div {
  max-width: 800px;
  margin: auto;
  padding: 20px;
  background: #242424;
  border-radius: 10px;
  box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
}
</style>

