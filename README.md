# Lista de Compras (Formulário)
Formulário com recursos do Ajax, ActiveEvent, ValueChange para lista de produtos.
O usuário deve digitar o nome do produto e a quantidade, ao clicar no botão Adicionar, um novo item é inserido na tabela.
Depois de inserido, o usuário pode utilizar os checkboxes localizados em cada linha da tabela para marcar os produtos adiquiridos, ou não.
Desta forma, caso o checkbox seja marcado, o item que corresponde à linha da tabela tem seu nome e quantidade riscados, na qual, caso seja desmarcado é retirado a marcação.

Referente a validação, ambos os campos são checados antes de serem incluídos na lista, na qual ao tirar o foco (evento blur) do campo, uma requisição AJAX é disparada.
Caso ocorra erro, a informação é exibida na tela imediatamente, antes mesmo de acionar o botão "Adicionar".

Após clicado no botão "Adicionar", uma nova requisição AJAX realiza o processo de limpar os campos do formulário e adicionam o novo item na tabela.
