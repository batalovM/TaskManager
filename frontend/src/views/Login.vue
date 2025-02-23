<template>
  <div class="login-wrapper">
    <div class="login-container">
      <h1>Вход</h1>
      <form @submit.prevent="login" class="login-form">
        <div class="input-group">
          <input
              type="text"
              id="username"
              v-model="username"
              required
              placeholder="Введите имя пользователя"
          />
        </div>
        <div class="input-group">
          <input
              type="password"
              id="password"
              v-model="password"
              required
              placeholder="Введите пароль"
          />
        </div>
        <button type="submit">Войти</button>
        <p v-if="errorMessage" class="error-message">{{ errorMessage }}</p>
      </form>
      <div class="register-link">
        <p>Нет учетной записи?</p>
        <button @click="register">Зарегистрироваться</button>
      </div>
    </div>

  </div>
</template>

<script>
export default {
  data() {
    return {
      username: '',
      password: '',
      confirmPassword: '',
      email: '',
      errorMessage: ''
    };
  },
  methods: {
    async login() {
      try {
        const response = await fetch('http://localhost:8080/api/auth/login', {
          method: 'POST',
          headers: {
            'Content-Type': 'application/json'
          },
          body: JSON.stringify({
            username: this.username,
            password: this.password
          })
        });

        if (response.ok) {
          this.$router.push('/dashboard');
        } else {
          const data = await response.json();
          this.errorMessage = data.message || 'Неверные данные';
        }
      } catch (error) {
        this.errorMessage = 'Ошибка подключения';
      }
    },
    async register(){
      try {
        const response = await fetch('http://localhost:8080/api/auth/registration', {
          method: 'POST',
          headers: {
            'Content-Type': 'application/json'
          },
          body: JSON.stringify({
            username: this.username,
            password: this.password,
            confirmPassword: this.confirmPassword,
            email: this.email
          })
        });

        if (response.ok) {
          this.$router.push('/');
        } else {
          const data = await response.json();
          this.errorMessage = data.message || 'Неверные данные';
        }
      } catch (error) {
        this.errorMessage = 'Ошибка подключения';
      }
    }
  }
};
</script>

<style scoped>
/* Стиль для обертки всего контента */
.login-wrapper {
  display: flex;
  justify-content: center;
  align-items: center;
  min-height: 100vh; /* Занимает всю высоту экрана */
  background-color: #ffffff; /* Цвет фона */
}

.login-container {
  width: 100%;
  max-width: 400px; /* Максимальная ширина формы */
  padding: 20px;
  background-color: #d5ebf2;
  border-radius: 8px;
  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center; /* Центрируем форму */
}

h1 {
  text-align: center;
  margin-bottom: 20px;
}

.login-form {
  display: flex;
  flex-direction: column;
  width: 100%; /* Занимает всю ширину контейнера */
}

.input-group {
  margin-bottom: 20px;
  width: 90%; /* Занимает всю ширину формы */
}

label {
  display: block;
  text-align: center; /* Центрируем текст метки */
  margin-bottom: 5px;
}

input {
  width: 100%; /* Занимает всю ширину родительского элемента */
  padding: 10px;
  margin-top: 5px;
  border: 1px solid #ccc;
  border-radius: 4px;
  font-size: 14px;
}

button {
  padding: 12px;
  background-color: #a8c6ed;
  color: white;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  font-size: 16px;
  width: 100%;
}

button:hover {
  background-color: #82b5e8;
}

.error-message {
  color: red;
  font-size: 14px;
  text-align: center;
  margin-top: 10px;
}

/* Медиазапросы для адаптивности */
@media (max-width: 768px) {
  .login-container {
    padding: 15px; /* Меньше отступов на мобильных устройствах */
  }
}

@media (max-width: 480px) {
  h1 {
    font-size: 18px; /* Меньше шрифт для мобильных устройств */
  }
}
</style>
