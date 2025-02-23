// main.js
import { createApp } from 'vue';
import App from './App.vue';
import DisciplineList from './components/DisciplineList.vue';
import QueueList from './components/QueueList.vue';
import './style.css';

const app = createApp(App);

app.provide('disciplines', [
    'Проектирование и администрирование баз данных',
    'Языки программирования',
    'Основы сетевых технологий-С',
    'Основы сетевых технологий-Л',
    'Математический анализ',
    'Основы проектирования информационных систем',
    'Технологии и методы программирования'
]);

app.provide('queue', [
    { id: 1, name: 'Тарасов Степан', time: '15:14', date: '05.04.2024' },
    { id: 2, name: 'Зелинка Дамиан', time: '15:30', date: '05.04.2024' },
    { id: 3, name: 'Нерсиян Артём', time: '15:44', date: '05.04.2024' }
]);

app.component('DisciplineList', DisciplineList);
app.component('QueueList', QueueList);

app.mount('#app');
