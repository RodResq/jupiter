export const navigation = [
  {
    text: 'Home',
    path: '/home',
    icon: 'home'
  },
  {
    text: 'Profile',
    path: '/profile',
    icon: 'user'
  },
  {
    text: 'Menu',
    icon: 'food',
    items: [
      {
        text: 'Entradas',
        path: '/tasks'
      },
      {
        text: 'Pratos Principais',
        path: ''
      },
      {
        text: 'Sobremensas',
        path: ''
      },
      {
        text: 'Bebidas',
        path: ''
      }
    ]
  },
  {
    text: 'Cadastro',
    path: 'cadastrar-prato',
    icon: 'user'
  },
];
