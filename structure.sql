/* -- BASE DE DADOS */

	--Criar Banco
	--CREATE DATABASE db_ProjetoTranspotadora;
	USE db_ProjetoTranspotadora;

	--sp_help tbl_CTRC

	--Criar Tabelas
CREATE TABLE tbl_Veiculo (
	IdVeiculo INT PRIMARY KEY IDENTITY(1,1),
	dsVeiculo VARCHAR(50) NOT NULL,
	nrPlaca_Veiculo VARCHAR(10) NOT NULL

);
	
CREATE TABLE tbl_Manifesto (
	IdManifesto INT PRIMARY KEY IDENTITY(1,1)NOT NULL,
	nrPlaca_Veiculo VARCHAR(8) NOT NULL,
	nmFilial_Origem VARCHAR(50) NOT NULL,
	nmFilial_Destino VARCHAR(50) NOT NULL

);
	
CREATE TABLE tbl_ManifestoVeiculo (
	IdManifestoVeiculo INT PRIMARY KEY IDENTITY(1,1)NOT NULL,
	IdManifesto INT FOREIGN KEY REFERENCES tbl_Manifesto(IdManifesto) NOT NULL,
	IdVeiculo INT FOREIGN KEY REFERENCES tbl_Veiculo(IdVeiculo) NOT NULL
);

CREATE TABLE tbl_Motorista (
	IdMotorista INT PRIMARY KEY IDENTITY(1,1),
	nome VARCHAR(50) NOT NULL,
	sexo CHAR(1) NOT NULL,
	IdAjudante INT FOREIGN KEY REFERENCES tbl_Motorista(IdMotorista) NULL
);

CREATE TABLE tbl_Cliente (
	IdCliente INT PRIMARY KEY IDENTITY(1,1),
	nome VARCHAR(50) NOT NULL,
	endereco VARCHAR(50) NOT NULL,
	cidade VARCHAR(50)NOT NULL,
	uf VARCHAR(30) NOT NULL,
	cnpj VARCHAR(14),
	cpf VARCHAR(11),
	telefone VARCHAR(15) NOT NULL

);

CREATE TABLE tbl_CTRC (
	IdCtrc INT PRIMARY KEY IDENTITY(1,1),
	IdClienteReme INT FOREIGN KEY REFERENCES tbl_Cliente (IdCliente) NOT NULL,
	IdClienteDest INT FOREIGN KEY REFERENCES tbl_Cliente (IdCliente) NOT NULL,
	dtEmissao DATE NOT NULL,
	qtPesoFrete INT NOT NULL,
	vlFrete MONEY 

);

CREATE TABLE tbl_ClienteCTRC (
	IdClienteCtrc INT PRIMARY KEY IDENTITY(1,1),
	IdCliente INT FOREIGN KEY REFERENCES tbl_ClienteDest(IdCli_Dest) NOT NULL,
	IdCtrc INT FOREIGN KEY REFERENCES tbl_CTRC (IdCtrc) NOT NULL,
 	tipo VARCHAR(20) NOT NULL -- Destinatário ou Remetente
);

CREATE TABLE tbl_CTRCManifesto (
	IdCtrcManifesto INT PRIMARY KEY IDENTITY(1,1)NOT NULL,
	IdManifesto INT FOREIGN KEY REFERENCES tbl_Manifesto (IdManifesto) NOT NULL,
	IdCtrc INT FOREIGN KEY REFERENCES tbl_CTRC (IdCtrc) NOT NULL
);

	--Inserir Veiculos

	-- DELETE tbl_Veiculo WHERE IdVeiculo>'0'
	-- SELECT * FROM tbl_Veiculo

INSERT INTO tbl_Veiculo (dsVeiculo, nrPlaca_Veiculo) VALUES ('VolksWagem', 'AAA-1111');
INSERT INTO tbl_Veiculo (dsVeiculo, nrPlaca_Veiculo) VALUES ('Volvo', 'BBA-2222');
INSERT INTO tbl_Veiculo (dsVeiculo, nrPlaca_Veiculo) VALUES ('Mercedes Benz', 'CCA-3333');
INSERT INTO tbl_Veiculo (dsVeiculo, nrPlaca_Veiculo) VALUES ('Mercedes Benz', 'DDA-4444');
INSERT INTO tbl_Veiculo (dsVeiculo, nrPlaca_Veiculo) VALUES ('VolksWagem', 'EEA-5555');

	--Inserir Motoristas

	-- DELETE tbl_Motorista WHERE IdMotorista>'0'
	-- SELECT * FROM tbl_Motorista

INSERT INTO tbl_Motorista(nmMotorista, dtNascimento, icSexo, nmTelefone) VALUES ('João da Silva', '1958-05-30', 'M', '(021)94444-3333');
INSERT INTO tbl_Motorista(nmMotorista, dtNascimento, icSexo, nmTelefone) VALUES ('Maria do Luz', '1965-10-05', 'F', '(011)95544-4444');
INSERT INTO tbl_Motorista(nmMotorista, dtNascimento, icSexo, nmTelefone) VALUES ('Fernando Gois', '1982-04-04', 'M', '(016)96644-5555');
INSERT INTO tbl_Motorista(nmMotorista, dtNascimento, icSexo, nmTelefone) VALUES ('Márcia Feliz', '1975-11-28', 'F', '(035)97744-6666');
INSERT INTO tbl_Motorista(nmMotorista, dtNascimento, icSexo, nmTelefone) VALUES ('Marcos Rueda', '1970-11-05', 'M', '(035)98888-7777');

	--Inserir Manifestos

	-- DELETE tbl_Manifesto WHERE IdManifesto>'0'
	-- SELECT * FROM tbl_Manifesto

INSERT INTO tbl_Manifesto(nrPlaca_Veiculo, nmFilial_Origem, nmFilial_Destino) VALUES ('AAA-1111', 'CD Santos','CD Cotia');
INSERT INTO tbl_Manifesto(nrPlaca_Veiculo, nmFilial_Origem, nmFilial_Destino) VALUES ('BBA-2222', 'CD Minas Gerais','CD Aracaju');
INSERT INTO tbl_Manifesto(nrPlaca_Veiculo, nmFilial_Origem, nmFilial_Destino) VALUES ('CCC-3333', 'CD Minas Gerais','CD São Paulo');
INSERT INTO tbl_Manifesto(nrPlaca_Veiculo, nmFilial_Origem, nmFilial_Destino) VALUES ('DDD-4444', 'CD São Paulo','CD Bahia');
INSERT INTO tbl_Manifesto(nrPlaca_Veiculo, nmFilial_Origem, nmFilial_Destino) VALUES ('EEE-5555', 'CD Santos','CD Rio de Janeiro');

	-- Inserir CTRCs

	-- DELETE tbl_CTRC WHERE IdCtrc>'0'
	-- SELECT * FROM tbl_CTRC

	--Formatando Moedas
	--Formatando Datas
	--SELECT nmCli_Rementente, nmCli_Destinatario, dtEmissao, qtPesoFrete, FORMAT  (vlFrete,'c', 'pt-br') AS vlFrete FROM tbl_CTRC
	--SELECT nmCli_Rementente, nmCli_Destinatario, qtPesoFrete,vlFrete, FORMAT (dtEmissao,'d', 'pt-br') AS dtEmissao FROM tbl_CTRC
 
INSERT INTO tbl_CTRC(nmCli_Rementente, nmCli_Destinatario, dtEmissao, qtPesoFrete, vlFrete) VALUES ('Pescados SP', 'Hipermercado Extra','2019-06-11','5000', '3750');
INSERT INTO tbl_CTRC(nmCli_Rementente, nmCli_Destinatario, dtEmissao, qtPesoFrete, vlFrete) VALUES ('Minérios Ouro', 'Lapidadora Sergipe','2019-01-11','3950','12750');
INSERT INTO tbl_CTRC(nmCli_Rementente, nmCli_Destinatario, dtEmissao, qtPesoFrete, vlFrete) VALUES ('Laticínios da Vovó', 'Distribuidora São João','2019-12-13','3000', '5300');
INSERT INTO tbl_CTRC(nmCli_Rementente, nmCli_Destinatario, dtEmissao, qtPesoFrete, vlFrete) VALUES ('Autometal', 'Auto Peças Kabum','2019-03-11', '5000', '9750');
INSERT INTO tbl_CTRC(nmCli_Rementente, nmCli_Destinatario, dtEmissao, qtPesoFrete, vlFrete) VALUES ('Eletrônicos SA', 'BIG Cell','2019-07-01', '900', '9310');

	-- Inserir Clientes_Remetente

	-- DELETE tbl_ClienteReme WHERE IdCli_Reme>'0'
	-- SELECT * FROM tbl_ClienteReme
	
INSERT INTO tbl_ClienteReme(nmCli_Rementente,nmEndereco,nmCidade,nmUF,cnpjCliente, cpfCliente, nmTelefone) VALUES ('Pescados SP', 'Rua Joaquim Silva, 375-Bairro do Limão', 'São Paulo', 'SP', '77551122000170', '', '(11) 2260-2780');
INSERT INTO tbl_ClienteReme(nmCli_Rementente,nmEndereco,nmCidade,nmUF,cnpjCliente, cpfCliente, nmTelefone) VALUES ('Minérios Ouro', 'Rua Silva Jardim, 115-Bairro Três Marias', 'Extrema', 'MG', '88443311000171', '', '(35) 2233-2781');
INSERT INTO tbl_ClienteReme(nmCli_Rementente,nmEndereco,nmCidade,nmUF,cnpjCliente, cpfCliente, nmTelefone) VALUES ('Laticínios da Vovó', 'Rua Presidente Kennedy,1000 - Centro', 'Extrema', 'MG', '33557788000172', '', '(35) 4422-2782');
INSERT INTO tbl_ClienteReme(nmCli_Rementente,nmEndereco,nmCidade,nmUF,cnpjCliente, cpfCliente, nmTelefone) VALUES ('Autometal', 'Rod. Anchieta, 1375-Centro','São Paulo', 'SP', '44335522000173', '', '(11) 5522-2783');
INSERT INTO tbl_ClienteReme(nmCli_Rementente,nmEndereco,nmCidade,nmUF,cnpjCliente, cpfCliente, nmTelefone) VALUES ('Eletrônicos SA', 'Rua Caminho do Mar, 6670-Bairro Saúde', 'Santos', 'SP', '55443311000174', '', '(13) 5566-2784');

	-- Inserir Clientes_Destinatário

	-- DELETE tbl_ClienteDest WHERE IdCli_Dest>'0'
	-- SELECT * FROM tbl_ClienteDest

INSERT INTO tbl_ClienteDest(nmCli_Destinatario,nmEndereco,nmCidade,nmUF,cnpjCliente, cpfCliente, nmTelefone) VALUES ('Hipermercado Extra', 'Rua Maria da Penha, 3000-Centro', 'Cotia', 'SP', '22336655000155', '', '(11) 8899-5005');
INSERT INTO tbl_ClienteDest(nmCli_Destinatario,nmEndereco,nmCidade,nmUF,cnpjCliente, cpfCliente, nmTelefone) VALUES ('Lapidadora Sergipe', 'Rua Sol,8700-Bairro das Flores', 'Arauã', 'SE', '', '23165498700', '(79) 2233-4004');
INSERT INTO tbl_ClienteDest(nmCli_Destinatario,nmEndereco,nmCidade,nmUF,cnpjCliente, cpfCliente, nmTelefone) VALUES ('Distribuidora São João', 'Rua Airton Senna, 6500-Bairro Limeira', 'São Paulo', 'SP', '22558899000157', '', '(11) 2211-4003');
INSERT INTO tbl_ClienteDest(nmCli_Destinatario,nmEndereco,nmCidade,nmUF,cnpjCliente, cpfCliente, nmTelefone) VALUES ('Auto Peças Kabum', 'Rua Joaquim Nabuco, 37-Bairro Ferraz Alvim', 'Salvador', 'BA', '11447788000158', '', '(11) 7744-3002');
INSERT INTO tbl_ClienteDest(nmCli_Destinatario,nmEndereco,nmCidade,nmUF,cnpjCliente, cpfCliente, nmTelefone) VALUES ('BIG Cell', 'Rua Netuno, 66-Bairro Limpão', 'Petrópolis', 'RJ', '11223344000159', '', '(21) 6699-3001');

	-- Inserir CTRCs_Manifestos

	-- DELETE tbl_CTRCManifesto WHERE IdCtrcManifesto>'0'
	-- SELECT * FROM tbl_CTRCManifesto

	--Formatando Moedas
	--SELECT nrPlaca_Veiculo, nmFilial_Origem, nmFilial_Destino, nmCli_Rementente, nmCli_Destinatario, qtPesoFrete, FORMAT  (vlFrete,'c', 'pt-br') AS vlFrete FROM tbl_CTRCManifesto
	
INSERT INTO tbl_CTRCManifesto(nmMotorista, nrPlaca_Veiculo, nmFilial_Origem, nmFilial_Destino, nmCli_Rementente, nmCli_Destinatario, qtPesoFrete, vlFrete,IdMotorista, IdVeiculo,IdManifesto,IdCli_Reme,IdCli_Dest, IdCtrc) VALUES ('João da Silva','AAA-1111', 'CD Santos','CD Cotia', 'Pescados SP', 'Hipermercado Extra','5000', '3750',1,1,1,1,1,1);
INSERT INTO tbl_CTRCManifesto(nmMotorista, nrPlaca_Veiculo, nmFilial_Origem, nmFilial_Destino, nmCli_Rementente, nmCli_Destinatario, qtPesoFrete, vlFrete,IdMotorista, IdVeiculo,IdManifesto,IdCli_Reme,IdCli_Dest, IdCtrc) VALUES ('Maria do Luz,','BBA-2222', 'CD Minas Gerais','CD Aracaju','Minérios Ouro', 'Lapidadora Sergipe','3950','12750',2,2,2,2,2,2);
INSERT INTO tbl_CTRCManifesto(nmMotorista, nrPlaca_Veiculo, nmFilial_Origem, nmFilial_Destino, nmCli_Rementente, nmCli_Destinatario, qtPesoFrete, vlFrete,IdMotorista, IdVeiculo,IdManifesto,IdCli_Reme,IdCli_Dest, IdCtrc) VALUES ('Fernando Gois','CCC-3333', 'CD Minas Gerais','CD São Paulo', 'Laticínios da Vovó', 'Distribuidora São João','3000', '5300',3,3,3,3,3,3);
INSERT INTO tbl_CTRCManifesto(nmMotorista, nrPlaca_Veiculo, nmFilial_Origem, nmFilial_Destino, nmCli_Rementente, nmCli_Destinatario, qtPesoFrete, vlFrete,IdMotorista, IdVeiculo,IdManifesto,IdCli_Reme,IdCli_Dest, IdCtrc) VALUES ('Márcia Feliz','DDD-4444', 'CD São Paulo','CD Bahia', 'Autometal', 'Auto Peças Kabum', '5000', '9750',4,4,4,4,4,4);
INSERT INTO tbl_CTRCManifesto(nmMotorista, nrPlaca_Veiculo, nmFilial_Origem, nmFilial_Destino, nmCli_Rementente, nmCli_Destinatario, qtPesoFrete, vlFrete,IdMotorista, IdVeiculo,IdManifesto,IdCli_Reme,IdCli_Dest, IdCtrc) VALUES ('Marcos Rueda','EEE-5555', 'CD Santos','CD Rio de Janeiro', 'Eletrônicos SA', 'BIG Cell','900', '9310',5,5,5,5,5,5);
